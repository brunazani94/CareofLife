///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package conection;
//
///**
// *
// * @author conta
// */
//public class localizador_google_maps {
//    /**
// * @license
// * Copyright 2019 Google LLC. All Rights Reserved.
// * SPDX-License-Identifier: Apache-2.0
// */
//// Note: This example requires that you consent to location sharing when
//// prompted by your browser. If you see the error "The Geolocation service
//// failed.", it means you probably did not give permission for the browser to
//// locate you.
//
//import com.google.maps;
//import com.google.maps.model.LatLng;
//import com.google.maps.model.MarkerOptions;
//import com.google.maps.model.InfoWindowOptions;
//
//public class MapExample {
//    private static GoogleMap map;
//    private static InfoWindow infoWindow;
//
//    public static void main(String[] args) {
//        map = new GoogleMap();
//        map.setCenter(new LatLng(-34.397, 150.644));
//        map.setZoom(6);
//
//        infoWindow = new InfoWindow();
//
//        Button locationButton = new Button();
//        locationButton.setText("Pan to Current Location");
//        locationButton.addStyleName("custom-map-control-button");
//        map.getControls().put(GoogleMap.ControlPosition.TOP_CENTER, locationButton);
//
//        locationButton.addClickListener(new ClickListener() {
//            @Override
//            public void onClick(ClickEvent event) {
//                if (Geolocation.isSupported()) {
//                    Geolocation.getCurrentPosition(new PositionCallback() {
//                        @Override
//                        public void onSuccess(Position position) {
//                            LatLng pos = new LatLng(position.getCoordinates().getLatitude(), position.getCoordinates().getLongitude());
//                            infoWindow.setPosition(pos);
//                            infoWindow.setContent("Location found.");
//                            infoWindow.open(map);
//                            map.setCenter(pos);
//                        }
//
//                        @Override
//                        public void onFailure(PositionError error) {
//                            handleLocationError(true, infoWindow, map.getCenter());
//                        }
//                    });
//                } else {
//                    // Browser doesn't support Geolocation
//                }
//            }
//        });
//    }
//
//    private static void handleLocationError(boolean browserHasGeolocation, InfoWindow infoWindow, LatLng pos) {
//        // Handle location error
//    }
//}
//
//
//    
//}
