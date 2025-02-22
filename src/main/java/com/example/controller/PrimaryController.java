    package com.example.controller;

    import com.example.model.Card;
    import com.example.model.Game;
    import com.example.view.App;

    import javafx.fxml.FXML;
    import javafx.scene.control.Label;
    import javafx.scene.image.ImageView;
    import javafx.scene.layout.HBox;

    public class PrimaryController {

        @FXML private HBox playerTable;
        @FXML private HBox computerTable;
        @FXML private ImageView mountain;

        @FXML private Label tablePoints;
        @FXML private Label playerPoints;
        @FXML private Label result;

        private Game game;

        public void turnover () {
            if (game.finish()) {
                result.setText("The game is over, start a new one");
                return;
            }

            game.distributeCardToPlayer(game.getPlayer());
            game.distributeCardToPlayer(game.getComputer());


            update();
        }

        public void update() {
            if (game.finish()) {
                result.setText(game.result());
            }

            playerPoints.setText("Player: " + game.getPlayer().getPoints());
            tablePoints.setText("Table: " + game.getComputer().getPoints());
            
            playerTable.getChildren().clear();
            computerTable.getChildren().clear();

            game.getPlayer().getCards().forEach((card) -> playerTable.getChildren().add(cardImage(card)));
            game.getComputer().getCards().forEach((card) -> computerTable.getChildren().add(cardImage(card)));

        }

        public void newGame() {
            game = new Game();
            playerTable.getChildren().clear();
            computerTable.getChildren().clear();
            playerPoints.setText("Player: 0");
            tablePoints.setText("Table: 0");
            result.setText("");
        }

        public void requestCard(){
            turnover();
        }

        public void stop() {
            game.getPlayer().stop();
            turnover();
        }

        private ImageView cardImage(Card card) {
            return new ImageView(App.class.getResource(card.imagePath()).toExternalForm());
        }

    }
