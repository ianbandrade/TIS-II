$(document).ready(function () {
  $(".masthead").visibility({
    once: false,
    onBottomPassed: function () {
      $(".fixed.menu").transition("fade in");
    },
    onBottomPassedReverse: function () {
      $(".fixed.menu").transition("fade out");
    }
  });
  $('#sidebar-icon').click(function () {
    $('.ui.sidebar').sidebar('toggle')
});
});