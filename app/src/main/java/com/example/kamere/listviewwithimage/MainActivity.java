package com.example.kamere.listviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView mlistView;
    int[] images = {R.drawable.apple,R.drawable.strawberry,R.drawable.pomegranates,R.drawable.oranges,R.drawable.watermelon,R.drawable.banana,R.drawable.kiwi,R.drawable.tomato,R.drawable.grapes};
    String[] names = {"Apple","Strawberries","Pomegranates","Oranges","Watermelon","Banana","Kiwi","Tomato","Grapes"};
    String[] SctNames = {"Malus Domestica","Fragaria Ananassa ","Punica Granatum","Citrus Sinensis","Citrullus Vulgaris","Musa Acuminata","Actinidia Deliciosa","Solanum Lycopersicum","Vitis vinifera"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = (ListView) findViewById(R.id.simpleListView);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           View view1 = getLayoutInflater().inflate(R.layout.list_layout, null);
            ImageView mImageView= (ImageView)view1.findViewById(R.id.imageView);
            TextView tTextView=(TextView)view1.findViewById(R.id.txtView);
            TextView dTextView =(TextView)view1.findViewById(R.id.txtDesc);
            mImageView.setImageResource(images[i]);
            tTextView.setText(names[i]);
            dTextView.setText(SctNames[i]);
            return view1;
        }
    }
}
