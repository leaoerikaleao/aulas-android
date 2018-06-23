package com.example.erika.exrest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView txResponse;
    TextView txDelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txResponse = findViewById(R.id.txResponse);
        Button bt = findViewById(R.id.btGet);

    }

    public void btApiGet(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pdm-cars-api.herokuapp.com/cars";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        txResponse.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                txResponse.setText(error.getMessage());
            }
        });
        queue.add(stringRequest);
    }

    public void btApiGetOne(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pdm-cars-api.herokuapp.com/cars/7";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        txResponse.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                txResponse.setText(error.getMessage());
            }
        });
        queue.add(stringRequest);

    }

    public void btApiPost(View view) throws JSONException {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pdm-cars-api.herokuapp.com/cars/";
        JSONObject json = new JSONObject();
        json.put("model", "Uno");
        json.put("brand", "Fiat");
        json.put("hp", "120");
        JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.POST, url, json, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                txResponse.setText(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", "8");
                params.put("model", "Gol");
                params.put("brand", "W");
                params.put("hp", "150");
                return params;
            };
        };
        queue.add(stringRequest);
    }

    public void btApiDelete(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pdm-cars-api.herokuapp.com/cars/45";

        StringRequest stringRequest = new StringRequest(Request.Method.DELETE, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


    }

    public void btUpdate(View view) throws JSONException {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pdm-cars-api.herokuapp.com/cars/51";
        JSONObject json = new JSONObject();
        json.put("model", "Model Update");
        json.put("brand", "Model Update");
        json.put("hp", "15");

        JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.PATCH, url, json, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                txResponse.setText("Cadastro atualizado com sucesso!");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
           /*protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", "8");
                params.put("model", "Gol");
                params.put("brand", "W");
                params.put("hp", "150");
                return params;
            };*/
        };
        queue.add(stringRequest);

    }
}
