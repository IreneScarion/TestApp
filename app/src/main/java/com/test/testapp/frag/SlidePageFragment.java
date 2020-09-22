package com.test.testapp.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.test.testapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SlidePageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SlidePageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView picha;

    public SlidePageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @param param2 Parameter 2.
     * @return A new instance of fragment SlidePageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SlidePageFragment newInstance(int position, String param2) {
        SlidePageFragment fragment = new SlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, position);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           // mParam1 = getArguments().getString(ARG_PARAM1);
          //  mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_slide_page, container, false);

        picha = view.findViewById(R.id.picha);

        int pos = getArguments().getInt(ARG_PARAM1);

        switch (pos){

            case 0:
                picha.setImageResource(R.drawable.planets);

                break;

            case 1:
                picha.setImageResource(R.drawable.fifthprezy);

                break;

            case 2:
                picha.setImageResource(R.drawable.nationalflag);

                break;

            case 3:

                picha.setImageResource(R.drawable.firstpresident);


                break;



        }



        return view;
    }
}