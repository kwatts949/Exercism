class Series
  def initialize(string)
    @string = string
  end

  def slices(n)
    raise ArgumentError if @string.length < n
    arr = []
    split_string = @string.to_s.split("")

    arrays = split_string.each_cons(n).to_a
    arrays.each {|array| arr.push( array.join())}
    arr
  end
end