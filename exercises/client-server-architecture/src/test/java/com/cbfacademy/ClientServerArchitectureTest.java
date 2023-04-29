package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Client-Server Architecture Test Suite")
public class ClientServerArchitectureTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final ClientServerArchitecture exercise = new ClientServerArchitecture();

        final String name = exercise.getName();

        assertThat(name, is("Client-Server Architecture"));
    }
}
