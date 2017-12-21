package com.example.admin.image_load;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

	List<String> mList = new ArrayList<>();
	GridView mImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addIamgeUrl();
		Log.e("nummm",mList.size()+"");
		mImageView=(GridView) findViewById(R.id.ima);
		//mImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.err));
		mImageView.setAdapter(new GridViewAdapter());

	}
	private class GridViewAdapter extends BaseAdapter
	{
		public class ViewHolder{
			ImageView Iv_musicicon;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder=null;
			if(convertView==null){
				convertView= LayoutInflater.from(getApplicationContext()).inflate(R.layout.music_list_xianshi, null);
				holder=new ViewHolder();
				holder.Iv_musicicon= (ImageView) convertView.findViewById(R.id.image);
				convertView.setTag(holder);
			}else{
				holder=(ViewHolder) convertView.getTag();
			}
			Klose.with(getApplicationContext()).add(holder.Iv_musicicon).load(mList.get(position));
			return convertView;
		}

		/*
		 * 功能：获得当前选项的ID
		 *
		 * @see android.widget.Adapter#getItemId(int)
		 */
		@Override
		public long getItemId(int position) {
			//System.out.println("getItemId = " + position);
			return position;
		}

		/*
		 * 功能：获得当前选项
		 *
		 * @see android.widget.Adapter#getItem(int)
		 */
		@Override
		public Object getItem(int position) {
			return null;
		}

		/*
		 * 获得数量
		 *
		 * @see android.widget.Adapter#getCount()
		 */
		@Override
		public int getCount() {
			return mList.size();
		}}
























	private void addIamgeUrl(){
		for (int i=0 ;i<imageThumbUrls.length;i++){
			mList.add(imageThumbUrls[i]);
		}
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513698901891&di=89246fe79f4912203a5dfe5747e7439e&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F29381f30e924b899889bbbf56a061d950b7bf65c.jpg");
		mList.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2828524420,2987476852&fm=27&gp=0.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757758&di=2bc67a675bee7b6add4ce0ba8f4b2418&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F7%2F590c3f0512f46.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757758&di=b1aa823ceb3558e628dcd71b198196e8&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fa%2F586db7c649335.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757757&di=b5384bc0fb20022213331c27389cb97d&imgtype=0&src=http%3A%2F%2Fb.zol-img.com.cn%2Fdesk%2Fbizhi%2Fimage%2F6%2F2560x1600%2F1432866808772.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781785034&di=5588445e0ce75c75ec67fa839e5c2283&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D3045032168%2C2734942508%26fm%3D214%26gp%3D0.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757757&di=f2739cc883d55d5f4cb1f9b150f898d4&imgtype=0&src=http%3A%2F%2Fpic64.nipic.com%2Ffile%2F20150409%2F20075253_150454101000_2.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757757&di=15eb9352f2def55d0546076f2e4df613&imgtype=0&src=http%3A%2F%2F4493bz.1985t.com%2Fuploads%2Fallimg%2F150820%2F1-150R0151633.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757757&di=fdbc23a0528422af7716f506ff8bce9b&imgtype=0&src=http%3A%2F%2Fimg18.3lian.com%2Fd%2Ffile%2F201710%2F18%2F9298523b0b6d5b9858a0813818b07b19.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781827281&di=a4ed1fb7b99c3f370ff84dbb01d3c1f7&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D2427569772%2C3948059940%26fm%3D214%26gp%3D0.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781757756&di=0955ecdc174426ae3ccc144de4d0a11d&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fa%2F586db7c770924.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865687&di=2c03063b13a771d2d4165c9bb89bab12&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fe%2F58a3be0060ebe.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865687&di=08c5f64fc47f8279850cfc2f8ca1b0ea&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F586db444c1cfc.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865687&di=895cbbebe3705abb60b6c0f0886d21e7&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F7%2F587f06403c6b9.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=a717319013c2c1981584535853ca5e70&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F4%2F59278e747f4f2.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=8f805fa10d19d8f172e8b4622815a0c4&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Ff%2F59112a49b9915.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=f31ccfff324c232542b41b18574ef44b&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F587733e77dab5.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=ca4d9fe9e06dd5a3f800050ec15ceac6&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fe%2F58aab87b54a21.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=567808dcab25d17ce68c9842cbb812aa&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F9%2F589d1a0a3830e.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865686&di=ec22fc45b6cb1be1853d0682057ffb09&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F9%2F57cf77c98184a.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865685&di=dff528b3de38da3511eecd9e4de07997&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F0%2F580dc99bf4203.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865685&di=d32ccc3a62ea078ac721cfe85314657b&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fc%2F58cca86cec0ec.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865685&di=2bdfcbb9bf58fc4f72e923814388b03a&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F8%2F577e2344120d8.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865684&di=4246e881079cdd3d7b02aeedc32c38e5&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F58aa97c28ae01.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865684&di=cd3f40f2ac395c1260af1fca259e1197&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fa%2F586db7bb50631.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865684&di=333eefec54dd8edf35bcf16f5f7cdda6&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F0%2F587834b7d8875.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865684&di=ef4f27e59d0f28bb68aac7b36b6c97b8&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fb%2F589bd83b6ba88.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865683&di=8b321e422bd00eee04a86d427158da1d&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F7%2F570360ed4f3fe.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865683&di=3f4097dfbc0b2aa888ff900c89e3027c&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F1%2F5969de0eb62a0.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865682&di=3c003cc6d03aea58f964cb1d078dc661&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F1%2F590c122a63fcc.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865682&di=5697f5af15260c26008ba180a7721650&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fd%2F58797c1671855.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865681&di=c9c6e7d60c0e81fa7f6a82e337e4cacb&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F0%2F587c355dc3292.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865681&di=d94baf3e0977348a7bf2c104e46dc432&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F6%2F574ffe01a8fc9.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865680&di=f606d60b1c2913b252c70f85f808e5c1&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fa%2F586db7bcca71a.jpg");
		mList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513781865680&di=cb0f205cb2cc9ab55de416f20b6933fd&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F8%2F597a965eaa636.jpg");



	}
	public final static String[] imageThumbUrls = new String[] {
			"http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383291_6518.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383291_8239.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383290_9329.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383290_1042.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383275_3977.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383265_8550.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383264_3954.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383264_4787.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383264_8243.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383248_3693.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383243_5120.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383242_3127.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383242_9576.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383242_1721.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383219_5806.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383214_7794.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383213_4418.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383213_3557.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383210_8779.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383172_4577.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383166_3407.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383166_2224.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383166_7301.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383165_7197.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383150_8410.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383131_3736.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383130_5094.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383130_7393.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383129_8813.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383100_3554.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383093_7894.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383092_2432.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383092_3071.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383091_3119.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383059_6589.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383059_8814.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383059_2237.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383058_4330.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406383038_3602.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382942_3079.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382942_8125.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382942_4881.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382941_4559.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382941_3845.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382924_8955.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382923_2141.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382923_8437.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382922_6166.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382922_4843.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382905_5804.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382904_3362.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382904_2312.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382904_4960.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382900_2418.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382881_4490.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382881_5935.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382880_3865.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382880_4662.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382879_2553.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382862_5375.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382862_1748.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382861_7618.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382861_8606.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382861_8949.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382841_9821.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382840_6603.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382840_2405.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382840_6354.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382839_5779.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382810_7578.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382810_2436.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382809_3883.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382809_6269.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382808_4179.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382790_8326.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382789_7174.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382789_5170.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382789_4118.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382788_9532.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382767_3184.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382767_4772.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382766_4924.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382766_5762.jpg",
			"http://img.my.csdn.net/uploads/201407/26/1406382765_7341.jpg"
	};

}
