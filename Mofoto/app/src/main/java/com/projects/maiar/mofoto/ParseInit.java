package com.projects.maiar.mofoto;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;



public class ParseInit extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Enables Local Datastore.
    Parse.enableLocalDatastore(this);


    // initialization code here
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("89c618cae7fda3207f956a9511b200b9934505a1")
            .clientKey("7557c7593005dde76e974b96a1fd24838b2ff24e")
            .server("http://ec2-52-37-186-228.us-west-2.compute.amazonaws.com:80/parse/")
            .build()
    );


    //ParseUser.enableAutomaticUser();

    ParseACL defaultACL = new ParseACL();
    defaultACL.setPublicReadAccess(true);
    defaultACL.setPublicWriteAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);

  }
}
