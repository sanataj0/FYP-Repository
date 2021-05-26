package com.example.deafanddumbcommunicator;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Fragment fragment=null;
    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;
    public HomeFragment() {
        
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        cardView1 = v.findViewById(R.id.card_view1);
        cardView2 = v.findViewById(R.id.card_view2);
        cardView3 = v.findViewById(R.id.card_view3);
        cardView4 = v.findViewById(R.id.card_view4);



cardView1.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        Fragment fragment = new marketInterface();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.homeFragment, new houseInterface());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});;

        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new marketInterface());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });;

        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new office_interface());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });;

        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new CamFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });;


        return v;

    }

}