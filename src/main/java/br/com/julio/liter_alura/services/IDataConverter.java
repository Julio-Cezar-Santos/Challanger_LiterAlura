package br.com.julio.liter_alura.services;

public interface IDataConverter{
    <T> T getData(String json, Class<T> classe);
}
