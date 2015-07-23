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

  //TODO: to be implemented
/*  private final Date    from;
  private final Date    to;
  private final Boolean verbatim;*/

  public SearchQuery(Builder builder) {
    this.query = builder.query;
    this.site = builder.site;
    this.numResults = builder.numResults;
/*    this.from = builder.from;
    this.to = builder.to;
    this.verbatim = builder.verbatim;*/
  }

  public static class Builder {

    private final String  query;
    private       String  site;
    private       Integer     numResults = 10;
/*    private       Date    from;
    private       Date    to;
    private       Boolean verbatim;*/

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

/*    public Builder from(Date from) {
      this.from = from;
      return this;
    }

    public Builder to(Date to) {
      this.to = to;
      return this;
    }

    public Builder verbatim(Boolean verbatim) {
      this.verbatim = verbatim;
      return this;
    }*/

  }

}
