package com.cbfacademy.restapiexercise.ious;

import java.util.*;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class IOUService {

    private final IOURepository iouRepository;

    public IOUService(IOURepository iouRepository) {
        this.iouRepository = iouRepository;
    }

    public List<IOU> getAllIOUs() {
        return iouRepository.findAll();
    }

    public IOU getIOU(UUID id) throws NoSuchElementException {
        return iouRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("IOU not found with id: " + id));
    }

    public IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException {
        if (iou.getId() != null) {
            throw new IllegalArgumentException("IOU must not have an id when creating");
        }
        return iouRepository.save(iou);
    }

    public IOU updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException {
        IOU existingIOU = getIOU(id);
        existingIOU.setAmount(updatedIOU.getAmount());
        existingIOU.setBorrower(updatedIOU.getBorrower());
        existingIOU.setLender(updatedIOU.getLender());
        return iouRepository.save(existingIOU);
    }

    public void deleteIOU(UUID id) {
        IOU existingIOU = getIOU(id);
        iouRepository.delete(existingIOU);
    }
}
