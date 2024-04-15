package com.spring3.oauth.helpers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Collection;

@NoRepositoryBean
public interface RefreshableCRUDRepository<T, ID> extends CrudRepository<T,ID> {

    void refresh(T s);
    void refresh(Collection<T> s);

    void flush();
}
