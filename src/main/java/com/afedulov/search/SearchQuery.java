package com.afedulov.search;

import java.util.Date;

import lombok.Getter;
import lombok.ToString;

/**
 * Created on 15.07.2015 by afedulov
 */
@ToString
@Getter
public class SearchQuery {

  private final String  query;
  private final String  site;
  private final Integer numResults;

  public SearchQuery(Builder builder) {
    this.query = builder.query;
    this.site = builder.site;
    this.numResults = builder.numResults;
  }

  public static class Builder {

    private final String  query;
    private       String  site;
    private       Integer     numResults = 10;

    public Builder(String query) {
      this.query = query;
    }

    public Builder site(String site) {
      this.site = site;
      return this;
    }

    public Builder numResults(Integer numResults) {
      this.numResults = numResults;
      return this;
    }

    public SearchQuery build() {
      return new SearchQuery(this);
    }
  }
}
