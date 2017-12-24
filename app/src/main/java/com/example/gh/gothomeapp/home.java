package com.example.gh.gothomeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.view.ViewGroup;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class home extends Fragment implements View.OnClickListener{
    Button button;
    public static home newInstance() {
        home fragment = new home();
        return fragment;
    }
    public static final String ACCOUNT_SID = ""; //Saved Keys to my notes
    public static final String AUTH_TOKEN = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
    /*public void buttonTest(View v){
        Button button=(Button) v;

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+18329561743"),
                new PhoneNumber("+18327667179"), "Hey your daughter is home!").create();

        System.out.println(message.getSid());
        ((Button) v).setText("clicked");
    }*/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber("+18329561743"),
                new PhoneNumber("+18327667179"), "Hey your daughter is home!").create();
    }


}