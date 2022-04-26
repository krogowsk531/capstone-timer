class Activity {
  constructor(category, description, minutes, seconds, tagColor) {
    this.category = category;
    this.description = description;
    this.minutes = minutes;
    this.seconds = seconds;
    this.tagColor = tagColor;
    this.completed = false;
    this.id = Date.now();
  };

  display() {
    userIntention.innerText = this.description;
    minutesText.innerText = this.minutes;
    secondsText.innerText = this.seconds;
    if (secondsText.innerText < 10) {
      secondsText.innerText = ('0' + secondsText.innerText);
    }
  }
}