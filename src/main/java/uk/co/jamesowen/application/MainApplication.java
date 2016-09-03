package uk.co.jamesowen.application;


import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import io.dropwizard.Application;
import io.dropwizard.auth.AuthFactory;
import io.dropwizard.auth.basic.BasicAuthFactory;
import io.dropwizard.setup.Environment;
import org.apache.log4j.Logger;
import org.mongodb.morphia.Morphia;
import uk.co.jamesowen.configuration.BlogPostServiceConfiguration;
import uk.co.jamesowen.configuration.MongoConfiguration;
import uk.co.jamesowen.resource.MailController;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Collections;
import java.util.Properties;

import static com.mongodb.MongoCredential.createCredential;
import static java.util.Collections.singletonList;

public class MainApplication extends Application<BlogPostServiceConfiguration> {

    private static final Logger LOGGER = Logger.getLogger(MainApplication.class);

    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    public void run(BlogPostServiceConfiguration configuration, Environment environment) {

environment.jersey().register(MailController.class);

    }


}
