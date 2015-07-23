Warning: 
From Google Terms of Service:
"Don’t misuse our Services. For example, don’t interfere with our Services or try to access them using a method other than the interface and the instructions that we provide."

Usage:
```java
	SearchQuery query = new SearchQuery.Builder("bunnies")
    				    .site("stackoverflow.com")
        				.numResults(10).build();
    SearchResult result = new GoogleWebSearch().search(query);
    System.out.println(result.getUrls());
```
