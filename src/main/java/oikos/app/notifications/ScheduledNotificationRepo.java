package oikos.app.notifications;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ScheduledNotificationRepo extends JpaRepository<ScheduledNotification, String> {}
