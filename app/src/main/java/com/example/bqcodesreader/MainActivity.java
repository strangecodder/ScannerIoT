package com.example.bqcodesreader;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class MainActivity extends AppCompatActivity{
    private Button scanButton;
    private TextView formatTxt, contentTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scanButton = findViewById(R.id.scanner_button);
        scanButton.setOnClickListener(v->{
            new Scanning().scanCode();
        });
    }

//    private void scanCode(){
//        ScanOptions options = new ScanOptions();
//        options.setPrompt("Scan it");
//        options.setBeepEnabled(true);
//        options.setOrientationLocked(true);
//        options.setCaptureActivity(CaptureAct.class);
//        launcher.launch(options);
//    }
//
//    ActivityResultLauncher<ScanOptions> launcher = registerForActivityResult(new ScanContract(), result->{
//        if(result.getContents()!=null){
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setTitle("Result");
//            builder.setMessage(result.getContents());
//            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.dismiss();
//                }
//            });
//        }
//    });
}