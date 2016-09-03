package uk.co.jamesowen.configuration;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class BlogPostServiceConfiguration extends Configuration {

  @Valid
  @NotNull
  MongoConfiguration mongoConfiguration;

  @Valid
  @NotNull
  String environment;

  public MongoConfiguration getMongoConfiguration() {
    return mongoConfiguration;
  }

  public void setMongoConfiguration(MongoConfiguration mongoConfiguration) {
    this.mongoConfiguration = mongoConfiguration;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }
}
