package ru.yandex.practicum.contacts.presentation.base;

import java.lang.reflect.Type;



public interface ListDiffInterface<T> {
     boolean theSameAs(T name);
     boolean equals(Object o) ;

}
