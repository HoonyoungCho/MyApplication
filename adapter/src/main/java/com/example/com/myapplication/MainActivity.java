package com.example.com.myapplication;
        import java.util.ArrayList;
        import android.app.Activity;
        import android.app.AlertDialog;
        import android.content.Context;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.widget.TextView;



public class MainActivity extends Activity {

    Activity act = this;
    GridView gridView;
    ArrayList<Bitmap> picArr = new ArrayList<Bitmap>();
    ArrayList<String> textArr = new ArrayList<String>();



    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Bitmap bm1 = BitmapFactory.decodeResource(getResources(), R.drawable.mov1);
        Bitmap bm2 = BitmapFactory.decodeResource(getResources(), R.drawable.mov2);
        Bitmap bm3 = BitmapFactory.decodeResource(getResources(), R.drawable.mov3);
        Bitmap bm4 = BitmapFactory.decodeResource(getResources(), R.drawable.mov4);
        Bitmap bm5 = BitmapFactory.decodeResource(getResources(), R.drawable.mov5);
        Bitmap bm6 = BitmapFactory.decodeResource(getResources(), R.drawable.mov6);
        Bitmap bm7 = BitmapFactory.decodeResource(getResources(), R.drawable.mov7);
        Bitmap bm8 = BitmapFactory.decodeResource(getResources(), R.drawable.mov8);
        Bitmap bm9 = BitmapFactory.decodeResource(getResources(), R.drawable.mov9);
        Bitmap bm10 = BitmapFactory.decodeResource(getResources(), R.drawable.mov10);

        picArr.add(bm1);
        picArr.add(bm2);
        picArr.add(bm3);
        picArr.add(bm4);
        picArr.add(bm5);
        picArr.add(bm6);
        picArr.add(bm7);
        picArr.add(bm8);
        picArr.add(bm9);
        picArr.add(bm10);

        textArr.add("신세계");
        textArr.add("괴물");
        textArr.add("구르믈 버서난 탈처럼");
        textArr.add("파파로티");
        textArr.add("완득이");
        textArr.add("본 레거시");
        textArr.add("하울링");
        textArr.add("수퍼맨 리턴즈");
        textArr.add("감시자들");
        textArr.add("설국열차");

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new gridAdapter());
    }

    public class gridAdapter extends BaseAdapter {
        LayoutInflater inflater;

        public gridAdapter() {
            inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
// TODO Auto-generated method stub
            return picArr.size();    //그리드뷰에 출력할 목록 수
        }
        @Override

        public Object getItem(int position) {
// TODO Auto-generated method stub

            return picArr.get(position);    //아이템을 호출할 때 사용하는 메소드

        }
        @Override

        public long getItemId(int position) {
// TODO Auto-generated method stub

            return position;    //아이템의 아이디를 구할 때 사용하는 메소드

        }
        Integer[] posterId = {
                R.drawable.mov1,R.drawable.mov2, R.drawable.mov3, R.drawable.mov4, R.drawable.mov5, R.drawable.mov6,
                R.drawable.mov7,R.drawable.mov8,R.drawable.mov9,R.drawable.mov10};



        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

// TODO Auto-generated method stub
            if(convertView == null) {
                convertView = inflater.inflate(R.layout.grid_item, parent, false);
            }

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            imageView.setImageBitmap(picArr.get(position));
            textView.setText(textArr.get(position));
            final int pos = position;
            imageView.setOnClickListener(new OnClickListener() {

                @Override

                public void onClick(View v) {
                    View dialogView = (View) View.inflate(MainActivity.this,R.layout.dialog,null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    switch (posterId[pos]) {
                        case R.drawable.mov1:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("신세계");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov2:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("괴물");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov3:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("구르믈 버서난 탈처럼");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov4:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("파파로티");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov5:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("완득이");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov6:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("본 레거시");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov7:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("하울링");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov8:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("수퍼맨 리턴즈");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov9:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("감시자들");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                        case R.drawable.mov10:
                            ivPoster.setImageResource(posterId[pos]);
                            dlg.setTitle("설국열차");
                            dlg.setIcon(R.drawable.movimg);
                            dlg.setView(dialogView);
                            dlg.setNegativeButton("닫기",null);
                            dlg.show();
                            break;
                    }
                }
            });
            return convertView;
        }
    }
}

