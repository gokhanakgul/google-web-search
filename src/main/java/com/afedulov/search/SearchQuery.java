package com.afedulov.search;

import lombok.Getter;
import lombok.ToString;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created on 15.07.2015 by afedulov
 */
@ToString
@Getter
public class SearchQuery {

    private final String query;
    private final String site;
    private final Integer numResults;
    private final String exclude;

    public SearchQuery(Builder builder) {
	this.query = builder.query;
	this.site = builder.site;
	this.numResults = builder.numResults;
	this.exclude = builder.exclude;
    }

    public static class Builder {

	private String query;
	private String site;
	private Integer numResults = 10;
	private String exclude;

	public Builder(String query) {
	    try {
		this.query = URLEncoder.encode(query, "UTF-8");
	    } catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	    }
	}

	public Builder site(String site) {
	    this.site = site;
	    return this;
	}

	public Builder numResults(Integer numResults) {
	    this.numResults = numResults;
	    return this;
	}

	public Builder exclude(String exclude) {
	    this.exclude = exclude;
	    return this;
	}

	public SearchQuery build() {
	    return new SearchQuery(this);
	}
    }
}
