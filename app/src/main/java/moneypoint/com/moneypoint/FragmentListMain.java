package moneypoint.com.moneypoint;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONObject;

public class FragmentListMain extends Fragment {
    ListView mListView;
    public static int [] prgmImages={R.drawable.icon_one,R.drawable.icon_two,R.drawable.icon_four,R.drawable.icon_five,R.drawable.icon_two,R.drawable.icon_four};
    public static String [] prgmNameList={"Chechk Blance","Review History","Send Money","Receive Money","Find Branches","Contect Us"};
    public static String [] prgmNameList2={"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout"
            ,"Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia"
            ,"All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary"
            ,"It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures"
            ,"The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc"
            ,"The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.moneypoint_listview_fragment, container, false);

        mListView = (ListView) rootView.findViewById(R.id.monypoint_listview);
        mListView.setAdapter(new PasswordAdapter(getActivity(), R.layout.moneypoin_customlist, prgmNameList));
        return rootView;
    }
class PasswordAdapter extends ArrayAdapter {

    public PasswordAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=((Activity)getContext()).getLayoutInflater().inflate(R.layout.moneypoin_customlist,null);
        TextView txt1 = (TextView) v.findViewById(R.id.txt_title_list);
        txt1.setText(prgmNameList[position]);
        TextView txt2 = (TextView) v.findViewById(R.id.txt_list_content);
        txt2.setText(prgmNameList2[position]);
        ImageView img = (ImageView) v.findViewById(R.id.imglist);
        img.setBackgroundResource(prgmImages[position]);
        return v;
    }
}
}