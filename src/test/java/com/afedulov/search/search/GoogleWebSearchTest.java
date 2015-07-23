package com.afedulov.search.search;

import com.afedulov.search.GoogleWebSearch;
import com.afedulov.search.SearchQuery;
import com.afedulov.search.SearchResult;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * GoogleWebSearch Tester.
 *
 * @author afedulov
 * @version 1.0
 * @since <pre>Jul 15, 2015</pre>
 */
public class GoogleWebSearchTest {

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  @Test
  public void testSearch() {
    SearchQuery query = new SearchQuery.Builder("bunnies")
        .site("stackoverflow.com")
        .numResults(10).build();
    SearchResult result = new GoogleWebSearch().search(query);
    assertThat(result.getSize(), equalTo(10));
  }
}
