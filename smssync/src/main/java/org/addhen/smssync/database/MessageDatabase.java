package org.addhen.smssync.database;

import java.util.List;

import static org.addhen.smssync.database.BaseDatabseHelper.DatabaseCallback;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
public interface MessageDatabase {

    public void put(List<Message> messages, DatabaseCallback<Void> callback);

    public void put(Message message, DatabaseCallback<Void> callback);

    public void deleteByUuid(String uuid, DatabaseCallback<Void> callback);

    public void deleteAll(DatabaseCallback<Void> callback);

    public void fetchByUuid(String uuid, DatabaseCallback<Message> callback);

    public void fetchByUuids(List<String> uuid, DatabaseCallback<List<Message>> callback);

    public void fetchAll(DatabaseCallback<List<Message>> callback);

    public void fetchByLimit(int limit, DatabaseCallback<List<Message>> callback);
}
