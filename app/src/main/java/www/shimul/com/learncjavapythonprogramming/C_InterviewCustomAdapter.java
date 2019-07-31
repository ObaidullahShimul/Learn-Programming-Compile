package www.shimul.com.learncjavapythonprogramming;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class C_InterviewCustomAdapter extends BaseExpandableListAdapter {



    private Context contextteam;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public C_InterviewCustomAdapter(Context contextteam, List<String> listDataHeader, HashMap<String, List<String>> listDataChild) {
        this.contextteam = contextteam;
        this.listDataHeader = listDataHeader;
        this.listDataChild = listDataChild;
    }


    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listDataChild.get(listDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listDataChild.get(listDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup parent) {

        String headerText = (String) getGroup(i);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) contextteam.getSystemService(contextteam.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.c_iq_group_layout, null);
        }

        TextView textView = (TextView) view.findViewById(R.id.headertextId_IQ);
        textView.setText(headerText);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup parent) {

        String childText = (String) getChild(i, i1);
        //String childText2=(String) getChild2(i,i1);

        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) contextteam.getSystemService(contextteam.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.c_iq_child_layout, null);
        }

        TextView textView = (TextView) view.findViewById(R.id.childtextId_IQ);
        textView.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
