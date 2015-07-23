package com.afedulov.search;

import com.afedulov.search.GoogleWebSearch.SearchConfig;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * GoogleWebSearch Tester.
 *
 * @author afedulov
 * @version 1.0
 * @since <pre>Jul 15, 2015</pre>
 */
@Category(IntegrationTest.class)
public class GoogleWebSearchTest {

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  @Test
  public void shouldSearch() {
 //Intentioanally commented out to comply to Google Terms of Service
 /*   SearchQuery query = new SearchQuery.Builder("bunnies")
        .site("stackoverflow.com")
        .numResults(10).build();
    SearchResult result = new GoogleWebSearch().search(query);
    assertThat(result.getSize(), equalTo(10));*/
  }

  @Test
  public void shouldSearchWithConfig() {
  //Intentioanally commented out to comply to Google Terms of Service
   /* SearchQuery query = new SearchQuery.Builder("bunnies")
        .site("stackoverflow.com")
        .numResults(10).build();
    SearchConfig config = new SearchConfig();
    config.setGOOGLE_SEARCH_URL_PREFIX("https://www.google.de/search?");
    SearchResult result = new GoogleWebSearch(config).search(query);
    assertThat(result.getSize(), equalTo(10));*/
  }

}
