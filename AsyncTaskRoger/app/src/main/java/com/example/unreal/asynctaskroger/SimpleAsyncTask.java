package com.example.unreal.asynctaskroger;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {

    TextView miTextView;


    SimpleAsyncTask(TextView tv){
        miTextView=tv;
    }

    public void onProgressUpdated(){

    }

    public void onPostExecute(String result){
        miTextView.setText(result);
    }

    @Override
    protected String doInBackground(Void... params) {

        Random r= new Random();
        int n = r.nextInt(11);


        int s = n* 200;

        try {
            Thread.sleep(s);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        return "Despierta al fin de dormir" + s + "milliseconds!" ;
    }
}
