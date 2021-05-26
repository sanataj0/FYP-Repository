package com.example.deafanddumbcommunicator;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link set_profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class set_profile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public DatePicker picker;
    public set_profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment set_profile.
     */
    // TODO: Rename and change types and number of parameters
    public static set_profile newInstance(String param1, String param2) {
        set_profile fragment = new set_profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_set_profile, container, false);
        Button signUp = v.findViewById(R.id.signUpButton1);
        TextView signIn = v.findViewById(R.id.signInButton1);
        // Inflate the layout for this fragment
        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSignUpForm();
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSignInForm();
            }
        });
        return v;
    }
    public void openSignUpForm(){

        Dialog alert;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
        }else {
            alert = new Dialog(getActivity());
        }
        LayoutInflater inflater=getLayoutInflater();
        View v= inflater.inflate(R.layout.activity_signup,null);

        alert.setContentView(v);

        alert.show();
        Window window = alert.getWindow();
        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        EditText Birthday=v.findViewById(R.id.Birthdate);
        picker=v.findViewById(R.id.datePicker);


        Birthday.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Dialog alert;
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
                }else {
                    alert = new Dialog(getActivity());
                }
                LayoutInflater inflater=getLayoutInflater();
                View v= inflater.inflate(R.layout.date_picker,null);

                alert.setContentView(v);

                alert.show();
                Window window = alert.getWindow();
                window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Birthday.setText(getCurrentDate());
            }

        });
    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
    public void openSignInForm(){

        Dialog alert;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
        }else {
            alert = new Dialog(getActivity());
        }
        LayoutInflater inflater=getLayoutInflater();
        View v= inflater.inflate(R.layout.activity_signin,null);

        alert.setContentView(v);

        alert.show();
        Window window = alert.getWindow();
        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}