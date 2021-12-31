package oikos.app.notifications;

import lombok.Data;

import java.time.Instant;

@Data
public class NotificationResponse {
  String id;
  String content;
  Instant dateCreation;
  EtatNotification etat;
  String lien;
}
