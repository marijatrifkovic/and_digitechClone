package com.rs.systempro.projectalpha;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ClubsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ClubsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClubsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ClubsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClubsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClubsFragment newInstance(String param1, String param2) {
        ClubsFragment fragment = new ClubsFragment();
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
        View rootView=inflater.inflate(R.layout.fragment_clubs,container,false);
        LinearLayout llWrapper=(LinearLayout) rootView.findViewById(R.id.llWrapper);

        ImageView club1=new ImageView(getActivity().getApplicationContext());
        club1.setImageResource(R.drawable.photo1);
        LinearLayout.LayoutParams lp1= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp1.setMargins(0,dpToPx(5),0,dpToPx(5));
        club1.setLayoutParams(lp1);
        club1.setAdjustViewBounds(true);
        llWrapper.addView(club1);
        club1.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View view){
                                         Intent intent=new Intent(getContext(),ClubActivity.class);
                                         intent.putExtra("id",1);
                                         startActivity(intent);
                                     }
                                 }
        );


        ImageView club2=new ImageView(getActivity().getApplicationContext());
        club1.setImageResource(R.drawable.photo2);
        LinearLayout.LayoutParams lp2= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.setMargins(0,dpToPx(5),0,dpToPx(5));
        club2.setLayoutParams(lp2);
        club2.setAdjustViewBounds(true);
        llWrapper.addView(club2);
        club2.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View view){
                                         Intent intent=new Intent(getContext(),ClubActivity.class);
                                         intent.putExtra("id",2);
                                         startActivity(intent);
                                     }
                                 }
        );

        ImageView club3=new ImageView(getActivity().getApplicationContext());
        club1.setImageResource(R.drawable.photo3);
        LinearLayout.LayoutParams lp3= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.setMargins(0,dpToPx(5),0,dpToPx(5));
        club3.setLayoutParams(lp3);
        club3.setAdjustViewBounds(true);
        llWrapper.addView(club3);
        club3.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View view){
                                         Intent intent=new Intent(getContext(),ClubActivity.class);
                                         intent.putExtra("id",3);
                                         startActivity(intent);
                                     }
                                 }
        );

        ImageView club4=new ImageView(getActivity().getApplicationContext());
        club1.setImageResource(R.drawable.photo4);
        LinearLayout.LayoutParams lp4= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.setMargins(0,dpToPx(5),0,dpToPx(5));
        club4.setLayoutParams(lp4);
        club4.setAdjustViewBounds(true);
        llWrapper.addView(club4);
        club4.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View view){
                                         Intent intent=new Intent(getContext(),ClubActivity.class);
                                         intent.putExtra("id",4);
                                         startActivity(intent);
                                     }
                                 }
        );

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}