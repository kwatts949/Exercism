class Series
  def initialize(string)
    @string = string
  end

  def slices(n)
    #["1"]
    p n
    split_string = @string.to_s.split("")

    p split_string
  end
end