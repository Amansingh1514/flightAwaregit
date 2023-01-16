package com.example.demo;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

//This class is responsible for sending HTTP requests using Rapid API calls.
public class ApiCalls {

    //API Call to get list of flights
    public String fprices(String adults, String origin, String destination, String departureDate) throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://skyscanner44.p.rapidapi.com/search-extended?adults="+adults+"&origin="+origin+"&destination="+destination+"&departureDate="+departureDate))
                .header("X-RapidAPI-Key", "5eda3ba939msh59b5687cc41afb9p10aab1jsn2eec0dc11a6e")
                .header("X-RapidAPI-Host", "skyscanner44.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    
    public String dprices(String ctry,String curr,String p1,String p2,String p3,String d,String d2) throws IOException, InterruptedException, ParseException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsedates/v1.0/"+ctry+"/"+curr+"/"+p1+"/"+p2+"/"+p3+"/"+d+"?inboundpartialdate="+d2))
				.header("x-rapidapi-key", "4e96ca0c82msh7acc5424070fda1p1c7d82jsn9ec25a33485e")
				.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String rts(String ctry,String curr,String p1,String p2,String p3,String d) throws IOException, InterruptedException, ParseException
	{
				HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browseroutes/v1.0/"+ctry+"/"+curr+"/"+p1+"/"+p2+"/"+p3+"/"+d))
				.header("x-rapidapi-key", "4e96ca0c82msh7acc5424070fda1p1c7d82jsn9ec25a33485e")
				.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String curs() throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/reference/v1.0/currencies"))
				.header("x-rapidapi-key", "4e96ca0c82msh7acc5424070fda1p1c7d82jsn9ec25a33485e")
				.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String cntrys() throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/reference/v1.0/countries/en-US"))
				.header("x-rapidapi-key", "4e96ca0c82msh7acc5424070fda1p1c7d82jsn9ec25a33485e")
				.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String placess(String curr,String code,String cntry,String locale) throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/"+code+"/"+curr+"/"+locale+"/?query="+cntry))
				.header("x-rapidapi-key", "4e96ca0c82msh7acc5424070fda1p1c7d82jsn9ec25a33485e")
				.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
}
