package com.example.deepanshu.reportcard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by deepanshu on 30/3/17.
 */

class ReportCardAdapter extends RecyclerView.Adapter<ReportCardAdapter.MyViewHolder> {

    private List<ReportCard> reportCardList;

    ReportCardAdapter(List<ReportCard> mReportCardList) {
        this.reportCardList = mReportCardList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inflater_marks, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ReportCard reportCard = reportCardList.get(position);

        holder.mSubjectName.setText(reportCard.getSubjectName());
        holder.mSubjectMark.setText(String.valueOf(reportCard.getSubjectMarks()));
        holder.mSubjectGrade.setText(reportCard.getSubjectGrade());
    }

    @Override
    public int getItemCount() {
        return reportCardList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView mSubjectIcon;
        private TextView_Lato mSubjectName;
        private Textview_lato_thin mSubjectMark;
        private Textview_lato_thin mSubjectGrade;

        MyViewHolder(View itemView) {
            super(itemView);
            mSubjectIcon = (CircleImageView) itemView.findViewById(R.id.subject_image);
            mSubjectName = (TextView_Lato) itemView.findViewById(R.id.subject_name);
            mSubjectMark = (Textview_lato_thin) itemView.findViewById(R.id.subject_marks);
            mSubjectGrade = (Textview_lato_thin) itemView.findViewById(R.id.subject_grade);
        }
    }
}
