package com.example.cashoutchargecalculator;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class charges_calculator extends AppCompatActivity {

    private String gatewayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charges_calculator);

        Intent intent = getIntent();
        gatewayName = intent.getStringExtra("gateway_name");

        String title = "";
        String cashoutInfo = "";
        int image_id = 0;

        assert gatewayName != null;
        switch (gatewayName) {
            case "BKASH":
                title = "বিকাশ";
                image_id = R.drawable.bkash_logo;
                cashoutInfo = "বিকাশ" + getString(R.string.charge_info);
                ((Button) findViewById(R.id.show_result_btn)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            // change this amount according to recent cashout charge
                            double cashout_charge = 18.50;
                            double priyo_cashout_charge = 14.90;

                            double amount_entered = Double.parseDouble(((EditText) findViewById(R.id.editText)).getText().toString());

                            double general_charge = amount_entered * (cashout_charge / 1000);
                            double general_total = amount_entered + general_charge;

                            double priyo_charge = amount_entered * (priyo_cashout_charge / 1000);
                            double priyo_total = amount_entered + priyo_charge;

                            ((TextView) findViewById(R.id.monitor)).setText("সাধারন এজেন্ট হতে ক্যাশআউটঃ\n" + "প্রতি হাজারে সাধারণ খরচ " + cashout_charge + " টাকা\n" + amount_entered + " টাকায় চার্জ বাবদ খরচ " + general_charge + " টাকা\n" + amount_entered + " টাকায় সর্বমোট খরচ " + general_total + " টাকা\n\n" + "প্রিয় এজেন্ট হতে ক্যাশআউটঃ\n" + "প্রতি হাজারে সাধারণ খরচ " + priyo_cashout_charge + " টাকা\n" + amount_entered + " টাকায় চার্জ বাবদ খরচ " + priyo_charge + " টাকা\n" + amount_entered + " টাকায় সর্বমোট খরচ " + priyo_total + " টাকা");

                        } catch (Exception e) {
                            ((TextView) findViewById(R.id.monitor)).setText("একটি ভুল হয়েছে, আবার চেষ্টা করুন");
                        }
                    }
                });
                break;
            case "NAGAD":
                title = "নগদ";
                image_id = R.drawable.nagad_logo;
                cashoutInfo = "নগদ" + getString(R.string.charge_info);
                ((TextView) findViewById(R.id.monitor)).setText("নগদ-এর জন্য এই ফিচারটি এখনো তৈরি করা হয়নি...");
                break;
            case "ROCKET":
                title = "রকেট";
                image_id = R.drawable.rocket_logo;
                cashoutInfo = "রকেট" + getString(R.string.charge_info);
                ((TextView) findViewById(R.id.monitor)).setText("রকেট-এর জন্য এই ফিচারটি এখনো তৈরি করা হয়নি...");
                break;
            default:
                finish();
                break;
        }

        ((ImageView) findViewById(R.id.app_logo)).setImageResource(image_id);
        ((TextView) findViewById(R.id.cashout_info)).setText(cashoutInfo);

        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * @noinspection deprecation
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}