package com.example.adolfohinojosa.permisos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission.CAMERA;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickboton(View v){
        if(ContextCompat.checkSelfPermission(this,CAMERA) != PackageManager.PERMISSION_GRANTED)
        {

            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CAMERA))
            {
                String[] lp = new String[]{Manifest.permission.CAMERA};
                ActivityCompat.requestPermissions(this,lp,1);
                Toast.makeText(this, "EEEE PRRO, QUIEN CHIGAOS TE CREES MECO, DI QUE SI WEY",Toast.LENGTH_LONG).show();
            }
            else
                {
                    String[] lp = new String[]{Manifest.permission.CAMERA};
                    ActivityCompat.requestPermissions(this,lp,1);
                }
        }
    }



    public void clickboton2(View v){
        if(ContextCompat.checkSelfPermission(this,ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {

            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION))
            {
                String[] lp = new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
                ActivityCompat.requestPermissions(this,lp,2);
                Toast.makeText(this, "EEEE PRRO, QUIEN CHIGAOS TE CREES MECO, DI QUE SI WEY",Toast.LENGTH_LONG).show();
            }
            else
            {
                String[] lp = new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
                ActivityCompat.requestPermissions(this,lp,2);
            }
        }
    }








    public void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        switch (requestCode)
        {
            case 1:
                if(grantResults.length > 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    /*SIMPLIFICAR SOLICITUD DE PERSMISOS COON CLASES*/
                }
                else
                    {

                    }
                break;
        }
    }

}
