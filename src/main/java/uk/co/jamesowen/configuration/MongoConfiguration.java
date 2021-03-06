package uk.co.jamesowen.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoConfiguration {

    private Integer port;
    private String host;
    private String db;
    private String user;
    private String password;
    private String authDb;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthDb() {
        return authDb;
    }

    public void setAuthDb(String authDb) {
        this.authDb = authDb;
    }
}
