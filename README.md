# ElasticSearch
Elastic Search Demo
http://www.mkyong.com/elasticsearch/elasticsearch-hello-world-example/

# Elasticsearch Java Examples
This is a sample of Elasticsearch Java Examples

---

## Description
* Account of registration , login , and offers a search function using itunes search API.

## Includes Samples
* get use _id
* search(multiple fields, multiple keywords, sorting, boost
* bulk load index
* update index
* delete index
* aggregation (average,stats,facets,subaggregation, multi subaggregation)
---

## Requires
* Java8

## http://www.mkyong.com/elasticsearch/elasticsearch-hello-world-example/
##### 3. ElasticSearch Terminology
We will discuss few important ElasticSearch Terminology: Index, Type, Document, Key, Value etc.

3.1 What is an Index in ElasticSearch?
In ElasticSearch, an Index is a collection of Documents. For instance, “bookstore” is a Document. Index is used for indexing, searching, updating and deleting Documents. It must be in lower case.

An Index is similar to Database in Relation Database World.

3.2 What is a Type in ElasticSearch?
In ElasticSearch, a Type is a category of similar Documents. That means we can group a set of similar Documents into a Type. As we know in real-world, a “bookstore” contains different kinds of items: a collection of “Books”, a collections Pens, Pencils, CDs etc. In the same way, “bookstore” Document (One kind of Index) can contain a collection of Types: books, pens,CDs etc.

A Type is similar to Table in Relation Database World.

3.3 What is a Document in ElasticSearch?
In ElasticSearch, a Document is an instance of a Type. It contains Data with Key and Value fairs. For instance, “title”:”Functional Programming In Java” is a Key:Value fair of a Document of Type:”Books”. Each Document has an id.

A Document is similar to a Row in a Table in Relation Database World. Key is Column name and value is Column value.

##### 4. ElasticSearch Commands Basics
As we know, ElasticSearch supports REST-Based API (JSON Over HTTP Protocol) to support CRUD (Create Read Update Delete) operations. It uses HTTP methods to perform its operations.

HTTP Request			Method	Usage
------------------------------------------------------------------
GET						To get or select or read data from ElasticSearch
POST					To create or update data to ElasticSearch
PUT						To create or update data to ElasticSearch
DELETE					To delete or remove existing data from ElasticSearch
----------------------------------------------------------------------------

### Note
To test ElasticSearch Operations, We can use any REST clients like POSTMAN, Fiddler, CURL command, Sense etc. I’m going to use Google Chrome POSTMAN to explore the ElasticSearch REST APIs. You can install POSTMAN or Sense as Chrome Extensions.
