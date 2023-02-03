class HighScores
  def initialize(scores)
    @scores = scores
  end

  def scores
    @scores
  end

  def latest
    @scores[-1]
  end
end