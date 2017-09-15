package com.zackeryrobinson.celebrityscope.view;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.zackeryrobinson.celebrityscope.R;

public class CelebrityScopeActivity extends AppCompatActivity implements DetailFragment.OnFragmentInteractionListener{

    private static final String DETAIL_FRAGMENT_TAG = "DetailFragment_Tag";
    private static final String celebrityShortDescription = "Aniston gained worldwide recognition for portraying Rachel Green on the television sitcom Friends (1994–2004), a role which earned her a Primetime Emmy Award, a Golden Globe Award, and a Screen Actors Guild Award.";
    private static final String celebrityName = "Jennifer Aniston";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrity_scope);
        addDetailFragment(celebrityName, celebrityShortDescription);
    }

    public void addDetailFragment(String celebrityName, String celebrityShortDescription){
        DetailFragment df = DetailFragment.newInstance(celebrityName, celebrityShortDescription);
        getSupportFragmentManager().beginTransaction().add(df, DETAIL_FRAGMENT_TAG).commit();
        Toast.makeText(this,celebrityName,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
