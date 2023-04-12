package homeworks.homework5.model;

import seminars.seminar5.personal.model.DictionaryStorage;
import seminars.seminar5.personal.model.DictionaryStorageFile;
import seminars.seminar5.personal.model.Repository;
import seminars.seminar5.personal.model.RepositoryImpl;

/** Фабрика создания реализации {@link Repository} */
public class RepositoryFactory {

    public static Repository create() {
        //Реализация работы с хранилищем через файл с разделителями из семинара
        //DictionaryStorage storage = new DictionaryStorageFile("data/users.txt", ",", "\r\n");

        //Реализация работы с хранилищем через файл с другими разделителями
        //DictionaryStorage storage = new DictionaryStorageFile("data/users.txt", ";", "\r\n\r\n");

        //хранилище справочника в БД
        DictionaryStorage storage = new DictionaryStorageDb("data/users.db");

        return new RepositoryImpl(storage);
    }
}
