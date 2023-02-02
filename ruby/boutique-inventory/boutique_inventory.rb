class BoutiqueInventory
  def initialize(items)
    @items = items
  end

  def item_names
   items.map {|x| x[:name]}.sort
  end

  def cheap
    items.select {|x| x[:price] < 30}
  end

  def out_of_stock
    items.select {|x| x[:quantity_by_size].empty? }
  end

  def stock_for_item(name)
    items.find {|x| x[:name]== name }.fetch(:quantity_by_size)
  end

  def total_stock
    items.map {|x| x[:quantity_by_size].values.sum}.sum
  end

  private
  attr_reader :items
end
