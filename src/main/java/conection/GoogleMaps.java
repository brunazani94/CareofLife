///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package conection;
//
//import javax.swing.JFrame;
//import javax.swing.SwingUtilities;
//
///**
// *
// * @author conta
// */
//public class GoogleMaps {
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> createAndShowGUI());
//    }
//
//    private static void createAndShowGUI() {
//        JFrame frame = new JFrame("Google Maps Example");
//        frame.setSize(800, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        final JFXPanel fxPanel = new JFXPanel();
//        frame.add(fxPanel);
//
//        Platform.runLater(() -> {
//            WebView webView = new WebView();
//            WebEngine webEngine = webView.getEngine();
//            
//            // Substitua 'SUA_CHAVE_API' pela sua chave da API do Google Maps
//            String html = "<html><head></head><body><div id='map' style='height: 100%; width: 100%;'></div>\n"
//                    + "<script async defer\n"
//                    + "src='https://maps.googleapis.com/maps/api/js?key=SUA_CHAVE_API&callback=initMap'>\n"
//                    + "</script></body></html>";
//
//            webEngine.loadContent(html);
//            Scene scene = new Scene(webView);
//            fxPanel.setScene(scene);
//        });
//
//        frame.setVisible(true);
//    }
//}