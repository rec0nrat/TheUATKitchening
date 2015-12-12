package com.tonikamitv.loginregister;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tylweiss on 11/22/2015.
 */
public class TabFragment1 extends Fragment implements View.OnClickListener{

    EditText messageText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.tab_fragment_1 ,null);

        String[] userMessages = {"Message1", "Message2", "Message3"};

        final ListAdapter theAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, userMessages);
        ListView theListView = (ListView) rootView.findViewById(R.id.listView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getActivity(), "CLikkkking the MessssAge!!! =)",
                        Toast.LENGTH_LONG).show();

            }
        });


        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        button = (Button) view.findViewById(R.id.btnPostMessage);
        messageText = (EditText) view.findViewById(R.id.tutorMessageInput);
        button.setOnClickListener(this);

    }

    public void postMessageClicked(){

        /*
        ServerRequests serverRequest = new ServerRequests();

        serverRequest.fetchUserDataAsyncTask(user, new GetUserCallback() {
            @Override
            public void done(User returnedUser) {
                if (returnedUser == null) {
                    showErrorMessage();
                } else {
                    logUserIn(returnedUser);
                }
            }
        });
        */


        String message = messageText.getText().toString();

        Toast.makeText(getActivity(), "Pposting the message!! =)", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        postMessageClicked();
    }

}