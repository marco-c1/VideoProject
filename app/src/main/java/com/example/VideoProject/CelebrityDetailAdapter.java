package com.example.VideoProject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * CelebrityDetailAdapter is an ArrayAdapter that can provide the layout for each list item based on a data source, which is a list of celebrity objects.
 */
public class CelebrityDetailAdapter extends ArrayAdapter<Celebrity> {

    /**
     * Create a new CelebrityDetailAdapter object.
     *
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param celebrity is the list of celebrities to be displayed.
     */
    public CelebrityDetailAdapter(Context context, int resource, ArrayList<Celebrity> celebrity) {
        super(context, 0, celebrity);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //  Check if an existing view is being reused, otherwise inflate the view.
        View initialView = convertView;
        if (initialView == null) {
            initialView = LayoutInflater.from(getContext()).inflate(R.layout.detail_celebrity, parent, false);
        }

        //  Get the Celebrity object located at this position in the list.
        Celebrity currentCelebrity = getItem(position);

        //  Find the ImageView in the detail_celebrity.xml layout with the celebrity's image.
        ImageView imageView = initialView.findViewById(R.id.image);
        imageView.setImageResource(currentCelebrity.getImage());

        //  Find the TextView in the detail_celebrity.xml layout with the celebrity's name.
        TextView textView = initialView.findViewById(R.id.textView);
        textView.setText(currentCelebrity.getName());

        //  Return the whole list item layout (containing one ImageView and one TextView) so that it
        //  can be shown in the ListView.
        return initialView;
    }
}