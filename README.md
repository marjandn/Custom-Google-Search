# Custom-Google-Search
with this module you can create custom searching in google engine in android app also you can use several filter that Google Provides for you, and then get search results in json format , so use it!!

if your app include a part that should search user input word in google engine and get result in json format and show in app , 
in simple word create custom browser; my mean from "custom search" is several search option and filter that google console provides for us like 

**- exactTerms** :  	Identifies a phrase that all documents in the search results must contain. 

**- excludeTerms** : Identifies a word or phrase that should not appear in any documents in the search results. 

**- siteSearch** :  Specifies all search results should be pages from a given site.

and other ...

you can see all of them and also test their in [google custom serch page](https://developers.google.com/custom-search/json-api/v1/reference/cse/list)

# so for use it in your android app you should follow this steps

## step 1
you should Log in to [Google Developers Console](https://console.cloud.google.com/cloud-resource-manager) with your google id (gmail).
and then create your project into this

## step 2
after created a project you should get your unique key 

## step 3
now you should create your [custom google engine](https://cse.google.com/cse/all) with selected custom domains to search to get a unique cx or your search engine ID

## step 4
and now you can use your key and cx and also base url that is same for all "https://www.googleapis.com/customsearch/v1" to connect your app
to google engine that it gives you result as json so you can use it as you want


**i suggest you to read [this article](http://www.basicsbehind.com/google-search-programmatically/) that explained very well**
