package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"OAbHgNu6DM7RHPFZOYr8M8UiDAMc3BsFLpmXtfzO",
	    	"2pz8qj7Zf3IObRdlCWtXOziTLmqdr4xKqzE4pBmJ");
	}
}
