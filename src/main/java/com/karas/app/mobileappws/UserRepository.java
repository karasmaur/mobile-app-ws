package com.karas.app.mobileappws;

import com.karas.app.mobileappws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository implements CrudRepository<UserEntity, Long> {

    @Override
    public <S extends UserEntity> S save(S s) {
        return s;
    }

    @Override
    public <S extends UserEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<UserEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<UserEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserEntity userEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
