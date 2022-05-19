package io.xgeeks.demo.api.impl.rest;

import io.xgeeks.demo.api.v1.model.User;
import io.xgeeks.demo.api.v1.model.UserWithId;
import io.xgeeks.demo.api.v1.rest.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public class UserRest implements UserApi {
    @Override
    public ResponseEntity<Void> deleteById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getUsers() {
        return null;
    }

    @Override
    public ResponseEntity<Void> patchUser(UUID id, User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> postUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> uploadAvatar(UUID id, MultipartFile receipt) {
        return null;
    }
}
