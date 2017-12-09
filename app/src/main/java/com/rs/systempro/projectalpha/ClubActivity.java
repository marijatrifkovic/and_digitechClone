package com.rs.systempro.projectalpha;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        Intent intent=getIntent();
        int id=intent.getIntExtra("id",1);
        ImageView ivCover=(ImageView)findViewById(R.id.ivCover);
        if(id==1)
        {
            ivCover.setImageResource(R.drawable.photo1);
        }
        if(id==2)
        {
            ivCover.setImageResource(R.drawable.photo2);
        }
        if(id==3)
        {
            ivCover.setImageResource(R.drawable.photo3);
        }
        if(id==4)
        {
            ivCover.setImageResource(R.drawable.photo4);
        }

        LinearLayout llRoot=(LinearLayout)findViewById(R.id.llRoot) ;
        RelativeLayout rlevent1=addevent("Prvi event","prvi event","2.12.2017","Monday");
                RelativeLayout rlevent2=addevent("Drugi event","drugi event","3.12.2017","Tuesday");
                RelativeLayout rlevent3=addevent("Treci event","treci event","4.12.2017.","Friday");
                RelativeLayout rlevent4=addevent("Cetvrti event","cetvrti event","5.12.2017.","Saturday");
                llRoot.addView(rlevent1);
        llRoot.addView(rlevent2);
        llRoot.addView(rlevent3);
        llRoot.addView(rlevent4);


    }

    private RelativeLayout addevent(String Title, String Description, String Date, String DoW)
    {

        RelativeLayout rlevent =new RelativeLayout(this);
        LinearLayout.LayoutParams llp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,dpToPx(200));
        rlevent.setBackgroundColor(Color.LTGRAY);
        rlevent.setLayoutParams(llp);

        LinearLayout lldate=new LinearLayout(this);
        lldate.setId(R.id.lldate);
        RelativeLayout.LayoutParams rlp=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,dpToPx(30));
        lldate.setBackgroundColor(Color.BLACK);
        //lldate.setPadding(dpToPx(8),0,dpToPx(8),0);
        lldate.setLayoutParams(rlp);



        TextView tvday=new TextView(this);
        tvday.setText(DoW);
        llp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        llp.weight=1;
        tvday.setLayoutParams(llp);

        TextView tvdate=new TextView(this);
        tvdate.setText(Date);
        tvdate.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tvdate.setLayoutParams(llp);

        lldate.addView(tvday);
        lldate.addView(tvdate);
        rlevent.addView(lldate);

        ImageView ivevent=new ImageView(this);
        ivevent.setId(R.id.ivevent);
        rlp=new RelativeLayout.LayoutParams(dpToPx(150),dpToPx(150));
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.ivevent);
        rlp.addRule(RelativeLayout.BELOW,R.id.lldate);
        rlp.addRule(RelativeLayout.ALIGN_PARENT_START);
        ivevent.setLayoutParams(rlp);
        ivevent.setBackgroundColor(Color.RED);
        rlevent.addView(ivevent);

        TextView tvEventTitle = new TextView(this);
        tvEventTitle.setId(R.id.tvEventTitle);
        tvEventTitle.setText(Title);
        tvEventTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        rlp=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.ivevent);
        rlp.addRule(RelativeLayout.ALIGN_PARENT_END);
        rlp.addRule(RelativeLayout.BELOW,R.id.llDate);
        rlp.setMargins(dpToPx(8),dpToPx(32),dpToPx(8),0);
        tvEventTitle.setLayoutParams(rlp);
        rlevent.addView(tvEventTitle);

        TextView tvEventDescription = new TextView(this);
        tvEventDescription.setId(R.id.tvEventDescription);
        tvEventDescription.setText(Description);
        tvEventDescription.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
//        tvEventTitle.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//        tvEventTitle.setTextColor(Color.BLACK);
        rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.ivevent);
        rlp.addRule(RelativeLayout.ALIGN_PARENT_END);
        rlp.addRule(RelativeLayout.BELOW,R.id.tvEventTitle);
        rlp.setMargins(dpToPx(8),0,dpToPx(8),dpToPx(8));
        tvEventDescription.setLayoutParams(rlp);
        rlevent.addView(tvEventDescription);

        Button btnTables = new Button(this);
        btnTables.setId(R.id.btnTables);
        btnTables.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        btnTables.setText("Tables");
        btnTables.setAllCaps(true);
        btnTables.setBackgroundResource(R.drawable.background_border);
        rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.ivevent);
        rlp.addRule(RelativeLayout.BELOW,R.id.tvEventDescription);
        btnTables.setLayoutParams(rlp);
        rlevent.addView(btnTables);

        Button btnGuestList = new Button(this);
        btnGuestList.setId(R.id.btnGuestList);
        btnGuestList.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        btnGuestList.setText("Guest list");
        btnGuestList.setAllCaps(true);
        btnGuestList.setBackgroundResource(R.drawable.background_border);
        rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.btnTables);
        rlp.addRule(RelativeLayout.BELOW,R.id.tvEventDescription);
        btnGuestList.setLayoutParams(rlp);
        rlevent.addView(btnGuestList);

        Button btnTickets = new Button(this);
        btnTickets.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        btnTickets.setText("Tickets");
        btnTickets.setAllCaps(true);
        btnTickets.setBackgroundResource(R.drawable.background_border);
        rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        rlp.addRule(RelativeLayout.RIGHT_OF,R.id.btnGuestList);
        rlp.addRule(RelativeLayout.BELOW,R.id.tvEventDescription);
        btnTickets.setLayoutParams(rlp);
        rlevent.addView(btnTickets);
        return rlevent;
    }

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
