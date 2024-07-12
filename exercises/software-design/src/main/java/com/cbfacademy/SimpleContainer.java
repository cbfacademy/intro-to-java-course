package com.cbfacademy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple IoC container that uses a map to store mappings between interfaces
 * and their implementations.
 * It provides methods to register mappings, create instances of interfaces, and
 * retrieve instances of interfaces.
 */
public class SimpleContainer {
    private final Map<Class<?>, Class<?>> types;

    /**
     * Constructs a new container with an empty map.
     */
    public SimpleContainer() {
        this(new HashMap<>());
    }

    /**
     * Constructs a new container with the provided map.
     *
     * @param types The map to be used for storing mappings.
     */
    public SimpleContainer(Map<Class<?>, Class<?>> types) {
        this.types = types;
    }
    /**
     * Register a mapping between an interface and its implementation.
     *
     * @param interfaceType      The interface type to be registered.
     * @param implementationType The implementation type to be registered.
     */
    public <TInterface, TImplementation extends TInterface> void register(Class<TInterface> interfaceType,
            Class<TImplementation> implementationType) {
        types.put(interfaceType, implementationType);
    }

    /**
     * Get a concrete instance of the specified interface type.
     * The implementation type is determined by the interface type and the
     * registered mappings.
     * 
     * @param interfaceType The interface type to be created.
     * @return An instance of the specified interface type.
     */
    public <TInterface> TInterface get(Class<TInterface> interfaceType) {
        return interfaceType.cast(createInstanceOf(types.get(interfaceType)));
    }

    private Object createInstanceOf(Class<?> type) {
        try {
            Constructor<?> constructor = type.getConstructors()[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameters = new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                parameters[i] = get(parameterTypes[i]);
            }

            return constructor.newInstance(parameters);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to create instance of type: " + type.getName(), e);
        }
    }
}
