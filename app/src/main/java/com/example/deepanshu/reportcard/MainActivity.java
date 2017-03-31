package com.example.deepanshu.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.report_rcv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ReportCard> mReportCardList = new ArrayList<>();
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Maths",
                84,
                "A"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Physics",
                98,
                "A+"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Chemistry",
                75,
                "B"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "English",
                88,
                "B+"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Biology",
                90,
                "A"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Hindi",
                3,
                "F"
        ));

        mRecyclerView.setAdapter(new ReportCardAdapter(mReportCardList));

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, mReportCardList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
